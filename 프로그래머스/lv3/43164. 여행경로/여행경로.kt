class Solution {
    private val load = mutableListOf<String>()
    fun solution(tickets: Array<Array<String>>): Array<String> {
        bfs(tickets, tickets, listOf("ICN"))

        load.sortBy { it }

        return load.first().split(" ").toTypedArray()
    }

    private fun bfs(tickets: Array<Array<String>>, remainTickets: Array<Array<String>>, currentLoad: List<String>) {
        if (remainTickets.isEmpty()) {
            load.add(currentLoad.joinToString(" "))
            return
        }
        remainTickets.map { cites ->
            if (cites.first() == currentLoad.last()) {
                val list = remainTickets.clone().toMutableList()
                list.remove(cites)
                val newList = currentLoad.map { it }.toMutableList()
                newList.add(cites.last())
                bfs(tickets, list.toTypedArray(), newList)
            }
        }
    }
}
