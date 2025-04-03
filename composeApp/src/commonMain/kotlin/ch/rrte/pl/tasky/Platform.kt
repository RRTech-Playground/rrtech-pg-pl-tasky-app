package ch.rrte.pl.tasky

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform