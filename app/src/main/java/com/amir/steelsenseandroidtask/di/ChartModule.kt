package com.amir.steelsenseandroidtask.diimport com.amir.steelsenseandroidtask.domain.ChartRepositoryimport com.amir.steelsenseandroidtask.domain.ChartRepositoryImplimport com.amir.steelsenseandroidtask.domain.useCase.GetChartDataUseCaseimport com.amir.steelsenseandroidtask.ui.LineChartViewModelimport org.koin.androidx.viewmodel.dsl.viewModelimport org.koin.dsl.moduleval chartModule = module {    single<ChartRepository> { ChartRepositoryImpl() }    factory { GetChartDataUseCase(get()) }    viewModel { LineChartViewModel(get()) }}