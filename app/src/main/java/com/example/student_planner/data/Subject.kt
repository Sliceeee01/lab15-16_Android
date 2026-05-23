package com.example.student_planner.data

data class Subject(
    val id: String,
    val name: String,
    val professor: String,
    val credits: Int,
    val currentGrade: String,
    val description: String
)

val sampleSubjects = listOf(
    Subject(
        id = "1",
        name = "Разработка мобильных приложений",
        professor = "Леонтьев Д.А.",
        credits = 10000,
        currentGrade = "Отлично",
        description = "Разработка нативных Android-приложений с использованием Kotlin и Jetpack Compose."
    ),
    Subject(
        id = "2",
        name = "Системное программирование",
        professor = "Токаев Т.И.",
        credits = 75,
        currentGrade = "Хорошо",
        description = "Низкоуровневая разработка на языке Rust."
    ),
    Subject(
        id = "3",
        name = "Разработка программных модулей",
        professor = "Донскова Д.А.",
        credits = 66,
        currentGrade = "Отлично",
        description = "Создание различных приложений на C#"
    ),
    Subject(
        id = "4",
        name = "Менеджемент",
        professor = "Запорожская С.А.",
        credits = 67,
        currentGrade = "Средне",
        description = "Изучение менеджемента"
    ),
    Subject(
        id = "5",
        name = "Мат. моделирование и Управленеие проектами",
        professor = "Трошина О.В.",
        credits = 90,
        currentGrade = "Отлично",
        description = "Изучение математического моделирования и ихучение программы Project"
    ),
    Subject(
        id = "6",
        name = "Англ. яз",
        professor = "Пенькова О.В.",
        credits = 91,
        currentGrade = "Отлично",
        description = "Изучение английского языка"
    ),
    Subject(
        id = "7",
        name = "Физ-ра",
        professor = "Магомедов С.К.",
        credits = 81,
        currentGrade = "Отлично",
        description = "Занятия физкультурой (готовит к олимпийским играм) "
    ),
    Subject(
        id = "8",
        name = "Кураторский час",
        professor = "Чистоткина.Е.С",
        credits = 75,
        currentGrade = "Отлично",
        description = "Проводит кур-часы отличный куратор , всегда поможет в случае проблем по учебе"
    )



)