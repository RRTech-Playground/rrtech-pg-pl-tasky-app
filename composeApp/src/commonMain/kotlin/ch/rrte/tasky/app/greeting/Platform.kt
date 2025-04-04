package ch.rrte.tasky.app.greeting

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform