package com.example.student_planner.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.student_planner.ui_model.DetailsScreen
import com.example.student_planner.ui_model.HomeScreen
import com.example.student_planner.ui_model.ProfileScreen
import com.example.student_planner.ui_model.RospisanieDetailScreen
import com.example.student_planner.ui_model.RospisanieScreen
import com.example.student_planner.ui_model.SettingsScreen

@Composable
fun StudentPlannerNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route,
        modifier = modifier
    ) {
        // Главный экран (список дисциплин)
        composable(route = Screen.Home.route) {
            HomeScreen(
                onSubjectClick = { subjectId ->
                    navController.navigate(Screen.Details.createRoute(subjectId))
                },
                onProfileClick = {
                    navController.navigate(Screen.Profile.route)
                },
                onSettingsClick = {
                    navController.navigate(Screen.Settings.route)
                },
                onRospisanieClick = {
                    navController.navigate(Screen.Rospisanie.route)
                }
            )
        }

        // Экран деталей дисциплины (с параметром subjectId)
        composable(
            route = Screen.Details.route,
            arguments = listOf(
                navArgument("subjectId") {
                    type = NavType.StringType
                }
            )
        ) { backStackEntry ->
            val subjectId = backStackEntry.arguments?.getString("subjectId") ?: ""
            DetailsScreen(
                subjectId = subjectId,
                onNavigateBack = {
                    navController.popBackStack()
                }
            )
        }

        // Экран профиля
        composable(route = Screen.Profile.route) {
            ProfileScreen(
                onNavigateBack = {
                    navController.popBackStack()
                }
            )
        }

        // Экран настроек
        composable(route = Screen.Settings.route) {
            SettingsScreen(
                onNavigateBack = {
                    navController.popBackStack()
                }
            )
        }

        // Экран расписания
        composable(route = Screen.Rospisanie.route) {
            RospisanieScreen(
                onNavigateBack = {
                    navController.popBackStack()
                },
                onLessonClick = { lessonId ->
                    navController.navigate(Screen.RospisanieDetail.createRoute(lessonId))
                }
            )
        }

        // Экран деталей занятия (с параметром lessonId)
        composable(
            route = Screen.RospisanieDetail.route,
            arguments = listOf(
                navArgument("lessonId") {
                    type = NavType.StringType
                }
            )
        ) { backStackEntry ->
            val lessonId = backStackEntry.arguments?.getString("lessonId") ?: ""
            RospisanieDetailScreen(
                lessonId = lessonId,
                onNavigateBack = {
                    navController.popBackStack()
                }
            )
        }
    }
}