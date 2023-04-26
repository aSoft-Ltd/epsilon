package epsilon.serializers

import epsilon.FileBlob
import kase.Result
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializer
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder


@Serializer(forClass = FileBlob::class)
object FileBlobSerializer : KSerializer<FileBlob> {
    override val descriptor = PrimitiveSerialDescriptor(
        serialName = "epsilon.FileBlob",
        PrimitiveKind.STRING
    )
    private val cache = mutableMapOf<String, FileBlob>()

    override fun deserialize(decoder: Decoder): FileBlob = decoder.decodeString().toFileBlob()

    override fun serialize(encoder: Encoder, value: FileBlob) = encoder.encodeString(value.toCachedSerialPath())

    private fun FileBlob.toCachedSerialPath(): String {
        val cachedPath = "$name @ $path"
        cache[cachedPath] = this
        return cachedPath
    }

    private fun String.toFileBlob(): FileBlob = Result(cache[this]).thenCatch {
        FileBlob(split(" @ ")[1])
    }.thenCatch {
        FileBlob(this)
    }.valueOrThrow(msg = "Failed to resolve $this into a FileBlob")
}