package navigation

sealed class Screen(val route: String){
    object HomeScreen : Screen("home_screen")
    object Hygiene : Screen("hygiene_screen")
    object TheEssentials : Screen("essential_screen")
    object Meat : Screen("meat_screen")
    object Veggies : Screen("veggie_screen")
    object SoupSauce : Screen("soup_screen")
    object Sensory : Screen("sensory_screen")
    object PuttingItAllTogether : Screen("putting_it_all_together_screen")
    object BeefVeal: Screen("beef_veal_screen")
    object Pork: Screen("pork_screen")
    object Lamb: Screen ("lamb_screen")
    object Poultry: Screen("poultry_screen")
}
