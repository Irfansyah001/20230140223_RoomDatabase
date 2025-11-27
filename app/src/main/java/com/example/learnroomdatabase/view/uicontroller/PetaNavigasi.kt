package com.example.learnroomdatabase.view.uicontroller

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.learnroomdatabase.view.EntrySiswaScreen
import com.example.learnroomdatabase.view.HomeScreen
import com.example.learnroomdatabase.view.route.DestinasiEntry
import com.example.learnroomdatabase.view.route.DestinasiHome

@Composable
fun SiswaApp(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier = Modifier
) {
    HostNavigasi(navController = navController, modifier = modifier)
}

