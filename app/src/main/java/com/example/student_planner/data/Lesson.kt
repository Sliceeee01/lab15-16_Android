package com.example.student_planner.data

data class Lesson(
    val id: String,
    val day: String,
    val time: String,
    val name: String,
    val room: String,
    val teacher: String
)

val sampleRospisanie = listOf(
    Lesson(
        id = "1",
        day = "Понедельник",
        time = "10:00 - 11:30",
        name = "Разработка мобильных приложений",
        room = "1.03",
        teacher = "Леонтьев Д.А."
    ),
    Lesson(
        id = "2",
        day = "Понедельник",
        time = "12:00 - 13:30",
        name = "Системное программирование",
        room = "3.02",
        teacher = "Токаев Т.И."
    ),
    Lesson(
        id = "3",
        day = "Вторник",
        time = "10:00 - 11:30",
        name = "Разработка программных модулей",
        room = "3.03",
        teacher = "Донскова Д.А."
    ),
    Lesson(
        id = "4",
        day = "Вторник",
        time = "12:00 - 13:30",
        name = "Менеджмент",
        room = "3.09",
        teacher = "Запорожская С.А."
    ),
    Lesson(
        id = "5",
        day = "Среда",
        time = "10:00 - 11:30",
        name = "Мат. моделирование и Управление проектами",
        room = "1.03",
        teacher = "Трошина О.В."
    ),
    Lesson(
        id = "6",
        day = "Среда",
        time = "12:00 - 13:30",
        name = "Английский язык",
        room = "3.03",
        teacher = "Пенькова О.В."
    ),
    Lesson(
        id = "7",
        day = "Четверг",
        time = "10:00 - 11:30",
        name = "Физическая культура",
        room = "Спортзал",
        teacher = "Магомедов С.К."
    ),
    Lesson(
        id = "8",
        day = "Четверг",
        time = "12:00 - 13:30",
        name = "Кураторский час",
        room = "3.09",
        teacher = "Чистоткина Е.С."
    )
)