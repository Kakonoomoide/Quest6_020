package com.example.pam_pert8.ui.view.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import com.example.pam_pert8.R
import com.example.pam_pert8.model.Mahasiswa
import com.example.pam_pert8.model.RencanaStudi

@Composable
fun DetailView(
    modifier: Modifier = Modifier,
    dataDiriMhs : Mahasiswa,
    dataMkMhs : RencanaStudi,
    onBackClicked : () -> Unit
){
    val inputDataMhs = listOf(
        Pair("NIM", dataDiriMhs.nim),
        Pair("Nama", dataDiriMhs.nama),
        Pair("Email", dataDiriMhs.email),
        Pair("Matakuliah", dataMkMhs.namaMk),
        Pair("Kelas", dataMkMhs.kelasMk)
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = colorResource(
                    id = R.color.primary
                )
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

    }
}