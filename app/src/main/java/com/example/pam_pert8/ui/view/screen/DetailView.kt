package com.example.pam_pert8.ui.view.screen

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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
}