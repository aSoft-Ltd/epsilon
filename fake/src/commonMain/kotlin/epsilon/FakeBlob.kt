package epsilon

import koncurrent.Executor
import koncurrent.Later

class FakeBlob<out T>(val value: T) : Blob {
    override fun readBytes(executor: Executor): Later<ByteArray> = Later.resolve(
        value = value.toString().encodeToByteArray(), executor = executor
    )
}