package com.example.pam_pert8.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.rememberNavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.pam_pert8.ui.view.screen.MahasiswaFormView
import com.example.pam_pert8.ui.view.screen.RencanaStudiView
import com.example.pam_pert8.ui.view.screen.SplashView
import com.example.pam_pert8.ui.view.viewmodel.MahasiswaViewModel
import com.example.pam_pert8.ui.view.viewmodel.RencanaStudyViewModel

enum class Halaman{
    Splash,
    InputMahasiswa,
    InputMatakuliah,
    TampilData
}

@Composable
fun PengelolaanHalaman(
    modifier: Modifier = Modifier,
    mahasiswaViewModel: MahasiswaViewModel = viewModel(),
    krsViewModel: RencanaStudyViewModel = viewModel(),
    navController: NavHostController = rememberNavController()
){
    val mahasiswaUiState = mahasiswaViewModel.mhsStateUi.collectAsState().value
    NavHost(
        navController = navController,
        startDestination = Halaman.Splash.name,
        modifier = Modifier.padding()
    ) {
        composable(route = Halaman.Splash.name){
            SplashView (onMulaiButton ={
                navController.navigate(
                    Halaman.InputMahasiswa.name
                )
            })
        }
        composable(route = Halaman.InputMahasiswa.name){
            MahasiswaFormView(
                onSubmitButtonClicked = {
                    mahasiswaViewModel.saveDataMhs(it)
                    navController.navigate(Halaman.InputMatakuliah.name)
                },
                onBackButtonClicked = {
                    navController.popBackStack()
                },
                modifier = Modifier
            )
        }
        composable(route = Halaman.InputMatakuliah.name){
            RencanaStudiView(
                mahasiswa = mahasiswaUiState,
                onSubmitButtonClicked = {
                    krsViewModel.saveDataKRS(it)
                },
                onBackButtonClicked = {
                    navController.popBackStack()
                }
            )
        }
    }
}