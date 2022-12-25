@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package epsilon

import epsilon.internal.FileBlobImpl
import org.w3c.dom.asList
import org.w3c.files.File
import org.w3c.files.FileList

@JsName("fileBlobFromUrl")
actual inline fun FileBlob(path: String): FileBlob = FileBlobImpl.from(path)

inline fun fileBlobsFrom(list: FileList? = null): Array<FileBlob> = list?.asList()?.map { fileBlobOf(it) }?.toTypedArray() ?: arrayOf()

inline fun fileBlobOf(file: File): FileBlob = FileBlobImpl(file)

inline fun fileBlobOfOrNull(file: File? = null): FileBlob? = file?.let { fileBlobOf(it) }