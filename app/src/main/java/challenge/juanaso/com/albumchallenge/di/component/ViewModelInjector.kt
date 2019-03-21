package challenge.juanaso.com.albumchallenge.di.component

import challenge.juanaso.com.albumchallenge.di.module.NetworkModule
import challenge.juanaso.com.albumchallenge.viewmodel.DetailViewModel
import challenge.juanaso.com.albumchallenge.viewmodel.MainViewModel
import challenge.juanaso.com.albumchallenge.viewmodel.PhotosViewModel
import dagger.Component
import javax.inject.Singleton

/**
 * Component providing inject() methods for presenters.
 */
@Singleton
@Component(modules = [(NetworkModule::class)])
interface ViewModelInjector {
    /**
     * Injects required dependencies into the specified PostListViewModel.
     * @param postListViewModel PostListViewModel in which to inject the dependencies
     */
    fun inject(mainViewModel: MainViewModel)
    fun inject(detailViewModel: DetailViewModel)
    fun inject(photosViewModel: PhotosViewModel)

    @Component.Builder
    interface Builder {
        fun build(): ViewModelInjector

        fun networkModule(networkModule: NetworkModule): Builder
    }
}