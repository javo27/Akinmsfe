package com.example.akinms.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.akinms.ui.Maps.MapsScreen
import com.example.akinms.ui.main.MainScreen
import com.example.akinms.ui.bodega.products.ProductsScreen
import com.example.akinms.ui.theme.AkinmsTheme
import com.example.akinms.util.*
import com.example.akinms.util.navigationGraph.RootNavigationGraph


@Preview
@Composable
fun AkinmsApp(){
    AkinmsTheme {
        val navController = rememberNavController()
        /*val navController = rememberNavController()
        val navigationActions = remember(navController){
            AkinmsActions(navController)
        }
        AkinmsNavGraph(
            navController = navController,
            navigateToProducts = navigationActions.navigateToProducts,
            navigateToCart = navigationActions.navigateToCart,
        )*/
        //LoginView()
        //HomeScreenV2()
        MainScreen(navController = navController)
        //MapsScreen(navController = navController)
        //RootNavigationGraph(navController = navController)
    }
}