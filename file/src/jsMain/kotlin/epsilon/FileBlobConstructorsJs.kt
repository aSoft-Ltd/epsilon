@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE", "NOTHING_TO_INLINE")

package epsilon

import epsilon.internal.FileBlobImpl
import kollections.List
import kollections.iEmptyList
import kollections.toIList
import org.w3c.dom.asList
import org.w3c.files.File
import org.w3c.files.FileList

@JsName("fileBlobFromUrl")
actual inline fun FileBlob(path: String): FileBlob = FileBlobImpl.from(path)

inline fun fileBlobsFrom(list: FileList?): List<FileBlob> = list?.asList()?.map { fileBlobOf(it) }?.toIList() ?: iEmptyList()

inline fun fileBlobOf(file: File): FileBlob = FileBlobImpl(file)

inline fun fileBlobOfOrNull(file: File? = null): FileBlob? = file?.let { fileBlobOf(it) }