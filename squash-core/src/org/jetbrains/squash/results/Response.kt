package org.jetbrains.squash.results

interface Response : Sequence<ResponseRow> {
    companion object {
        val Empty = object : Response {
            val sequence = emptySequence<ResponseRow>()
            override fun iterator(): Iterator<ResponseRow> = sequence.iterator()
        }
    }
}