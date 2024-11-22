package com.example.pam_pert8.ui.view.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
        Spacer(modifier = Modifier.padding(16.dp))
        Row (
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Image(
                painter = painterResource(
                    id = R.drawable.logoumy
                ),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(45.dp).clip(CircleShape)
            )
            Spacer(modifier = Modifier.padding(start = 16.dp))
            Column {
                Text(
                    text = "Universitas Muhammadiyah Yogyakarta",
                    color = Color.Red,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "Unggul dan Islami",
                    color = Color.Red,
                    fontWeight = FontWeight.Light
                )
            }
        }
    }
}