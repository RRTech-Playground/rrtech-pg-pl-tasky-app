package ch.rrte.pl.tasky.greeting

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform