package delegatepatternpractice

/**
 * kotlin support delegate pattern with by keyword.
 * This is only for practice.
 */
fun main() {
    val worker = Worker("Wonyoung")
    val delegate = object : EstateAgent {
        override fun contract() {
            println("delegate contract")
        }

        override fun search() {
            println("delegate search")
        }

        override fun loan() {
            println("delegate loan")
        }
    }
    worker.setDelegate(delegate)
    worker.work()
    println()
    worker.rentHouse()
}