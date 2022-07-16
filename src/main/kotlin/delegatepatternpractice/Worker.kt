package delegatepatternpractice

class Worker(private val name: String) {
    private lateinit var delegate: EstateAgent

    fun setDelegate(delegate: EstateAgent) {
        this.delegate = delegate
    }

    fun work() {
        println("$name works like below")
        println("Develop")
        println("Java")
        println("Kotlin")
        println("Algorithm")
        println("Refactoring")
        println("DesignPattern")
    }

    fun rentHouse() {
        delegate.search()
        delegate.loan()
        delegate.contract()
    }
}