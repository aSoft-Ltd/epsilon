@file:JvmName("FileBlobConstructorsJvm")

package epsilon

import epsilon.internal.FileBlobImpl

actual inline fun FileBlob(path: String): FileBlob = FileBlobImpl.of(path)