package screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import dev.chris.ouichefcompose.R
import dev.chris.ouichefcompose.ui.theme.GradientButton
import dev.chris.ouichefcompose.ui.theme.IntroductionCard
import dev.chris.ouichefcompose.ui.theme.OuiChefComposeTheme
import navigation.Screen


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun HomeScreen(navController: NavController) {
    OuiChefComposeTheme {
        Box(
            modifier = Modifier
                .fillMaxSize()


        ) {

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(MaterialTheme.colors.primary)
                    .verticalScroll(rememberScrollState(), enabled = true),
                horizontalAlignment = CenterHorizontally,
                verticalArrangement = Arrangement.SpaceEvenly


            ) {

                Box(
                    modifier = Modifier

                        .fillMaxWidth(),
                ) {
                    Image(
                        modifier = Modifier
                            .fillMaxWidth()
                            .align(Center)
                            .padding(16.dp, 8.dp, 16.dp, 8.dp),
                        painter = painterResource(R.drawable.oui_chef_title2),
                        contentDescription = "Title",
                        contentScale = ContentScale.Crop,

                        )

                    Spacer(
                        modifier = Modifier
                            .padding(0.dp, 25.dp)
                            .fillMaxWidth()
                    )
                }
                Row(

                    modifier = Modifier.width(320.dp)
                ) {
                    val introTitle = "Introduction"
                    val introBody = stringResource(R.string.introduction)
                    IntroductionCard(
                        title = introTitle,
                        description = introBody,
                        textColor = MaterialTheme.colors.primaryVariant
                    )

                }
                Spacer(
                    modifier = Modifier
                        .padding(0.dp, 30.dp)
                        .fillMaxWidth()
                )

                    Row(
                        modifier = Modifier

                            .fillMaxWidth(),
                        Arrangement.SpaceEvenly
                    ) {
                        HygieneButton(navController)

                    }

                    Spacer(
                        modifier = Modifier
                            .padding(0.dp, 10.dp)
                            .fillMaxWidth()
                    )

                Row(
                    modifier = Modifier

                        .fillMaxWidth(),
                    Arrangement.SpaceEvenly
                ) {
               EssentialButton(navController)
                }

                Spacer(
                    modifier = Modifier
                        .padding(0.dp, 10.dp)
                        .fillMaxWidth()
                )
                Row(
                    modifier = Modifier

                        .fillMaxWidth(),
                    Arrangement.SpaceEvenly
                ) {
          MeatButton(navController)
                }
                Spacer(
                    modifier = Modifier
                        .padding(0.dp, 10.dp)
                        .fillMaxWidth()
                )

                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        Arrangement.SpaceEvenly
                    ) {
                        VeggieButton(navController)
                    }

                    Spacer(
                        modifier = Modifier
                            .padding(0.dp, 10.dp)
                            .fillMaxWidth()
                    )
                Row(
                    modifier = Modifier

                        .fillMaxWidth(),
                    Arrangement.SpaceEvenly
                ) {
                    SoupAndSauceButton(navController)
                }
                Spacer(
                    modifier = Modifier
                        .padding(0.dp, 10.dp)
                        .fillMaxWidth()
                )

                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        Arrangement.SpaceEvenly
                    ) {

                        SensoryButton(navController)
                    }
                    Spacer(
                        modifier = Modifier
                            .padding(0.dp, 10.dp)
                            .fillMaxWidth()
                    )

                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        Arrangement.SpaceEvenly
                    ) {
                        PuttingItAllTogetherButton(navController)
                    }
                Spacer(modifier = Modifier
                    .padding(0.dp,0.dp,0.dp,15.dp))

            }
        }

    }
}



@Composable
fun HygieneButton(navController: NavController){

    GradientButton(

        text = "Hygiene", textColor = MaterialTheme.colors.primaryVariant, gradient = Brush.verticalGradient(
            colors = listOf(
                MaterialTheme.colors.secondary,MaterialTheme.colors.primary
            )

        ),
    onClick = { navController.navigate(Screen.Hygiene.route)}
    )


}


@Composable
fun EssentialButton(navController: NavController) {
    GradientButton(
        text = "The Essentials",textColor = MaterialTheme.colors.primaryVariant, gradient = Brush.verticalGradient(
            colors = listOf(
                MaterialTheme.colors.secondary, MaterialTheme.colors.primary
            )
        ), onClick = {navController.navigate(Screen.TheEssentials.route)}

    )


}

@Composable
fun MeatButton(navController: NavController) {
    GradientButton(
        text = "Meat & Fish",textColor = MaterialTheme.colors.primaryVariant, gradient = Brush.verticalGradient(
            colors = listOf(
                MaterialTheme.colors.secondary,MaterialTheme.colors.primary

            )
        ), onClick = {navController.navigate(Screen.Meat.route)}


    )
}

@Composable
fun VeggieButton(navController: NavController) {
    GradientButton(
        text = "Vegetables & Herbs", textColor = MaterialTheme.colors.primaryVariant, gradient = Brush.verticalGradient(
            colors = listOf(
                MaterialTheme.colors.secondary, MaterialTheme.colors.primary
            )
        ),onClick = {navController.navigate(Screen.Veggies.route)}

    )


}


@Composable
fun SoupAndSauceButton(navController: NavController) {
    GradientButton(
        text = "Soup & Sauces",textColor = MaterialTheme.colors.primaryVariant, gradient = Brush.verticalGradient(
            colors = listOf(
                MaterialTheme.colors.secondary, MaterialTheme.colors.primary
            )
        ),  onClick = {navController.navigate(Screen.SoupSauce.route)}
    )

        }


@Composable
fun SensoryButton(navController: NavController) {
    GradientButton(
        text = "Sensory",textColor = MaterialTheme.colors.primaryVariant, gradient = Brush.verticalGradient(
            colors = listOf(
                MaterialTheme.colors.secondary, MaterialTheme.colors.primary
            )
        ), onClick = {navController.navigate(Screen.Sensory.route)}
    )
}


@Composable
fun PuttingItAllTogetherButton(navController: NavController) {
    GradientButton(
        text = "Putting it all together",
        textColor = MaterialTheme.colors.primaryVariant, gradient = Brush.verticalGradient(
            colors = listOf(
                MaterialTheme.colors.secondary, MaterialTheme.colors.primary
            )
        ), onClick = {navController.navigate(Screen.PuttingItAllTogether.route)}



    )


}

