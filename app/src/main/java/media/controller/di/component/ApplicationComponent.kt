package media.controller.di.component

import android.content.Context
import android.content.SharedPreferences
import media.controller.App
import media.controller.di.module.ApplicationModule
import media.controller.di.module.DatabaseModule
import media.controller.ui.main.MainActivityViewModel

import media.controller.di.module.NetModule

import dagger.Component
import javax.inject.Singleton


@Singleton

@Component(modules = arrayOf(ApplicationModule::class,NetModule::class,DatabaseModule::class))


interface ApplicationComponent {
    fun app(): App


    fun context(): Context

    fun preferences(): SharedPreferences

    fun inject(mainActivityViewModel: MainActivityViewModel)
}
