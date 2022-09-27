package navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import screens.*

@Composable
fun SetupNavGraph(
    navController: NavHostController
){
    NavHost(
        navController = navController ,
        startDestination =  Screen.HomeScreen.route
        ){
            composable(
                route = Screen.HomeScreen.route
            ){
                HomeScreen(navController = navController)
            }
        composable(
            route = Screen.Hygiene.route
        ){
            Hygiene(navController)
        }
        composable(
            route = Screen.TheEssentials.route
        ){
            TheEssentials(navController)
        }
        composable(
            route = Screen.Meat.route
        ){
            Meat(navController)
        }
        composable(
            route = Screen.BeefVeal.route
        ){
            BeefVeal(navController)
        }
        composable(
            route = Screen.Pork.route){
                Pork(navController)
            }
        composable(route = Screen.Lamb.route){
            Lamb(navController)
        }
        composable(route = Screen.Poultry.route){
            Poultry(navController)
        }
        composable(
            route = Screen.Veggies.route
        ){
            Veggies(navController)
        }
        composable(
            route = Screen.SoupSauce.route
        ){
            SaucesAndSoup(navController)
        }
        composable(
            route = Screen.Sensory.route
        ){
            Sensory(navController)
        }
        composable(
            route = Screen.PuttingItAllTogether.route
        ){
            PuttingItAllTogether(navController)
        }
    }
}