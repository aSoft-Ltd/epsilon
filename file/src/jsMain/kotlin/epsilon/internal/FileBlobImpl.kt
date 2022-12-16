@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package epsilon.internal

import epsilon.FileBlob
import epsilon.readBytesOf
import koncurrent.Executor
import org.w3c.files.File
import org.w3c.files.FileReader

@PublishedApi
internal class FileBlobImpl(val file: File) : FileBlob {
    override val name: String = file.name
    private val reader by lazy { FileReader() }
    override fun readBytes(executor: Executor) = reader.readBytesOf(
        blob = file,
        executor = executor,
        actionName = "Reading ${file.name}",
        onAbortMessage = "File reading of ${file.name} has been aborted",
        onErrorMessage = "Failed to read file: ${file.name}"
    )
}