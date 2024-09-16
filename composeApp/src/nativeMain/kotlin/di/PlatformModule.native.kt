package di

import org.koin.core.module.Module
import org.koin.dsl.module
import ui.download.PlatformDownloadImage


actual fun platformModule(): Module {
    return module {
        single {
            PlatformDownloadImage()
        }
    }
}