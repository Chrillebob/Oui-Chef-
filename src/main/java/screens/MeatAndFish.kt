package screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import dev.chris.ouichefcompose.R
import dev.chris.ouichefcompose.ui.theme.ExpandableCard
import dev.chris.ouichefcompose.ui.theme.OuiChefComposeTheme
import navigation.Screen


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun Meat(navController: NavController) {
    OuiChefComposeTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colors.primary)
                .verticalScroll(rememberScrollState(), enabled = true)

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
                    painter = painterResource(R.drawable.meat_and_fish1),
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
                modifier = Modifier
                    .fillMaxWidth()
                    .absolutePadding(28.dp, 28.dp, 28.dp),
            ) {
                Text(
                    fontSize = 20.sp,
                    color = MaterialTheme.colors.primaryVariant,
                    text = stringResource(R.string.meat_intro)
                )
            }
            Box(modifier = Modifier
                .fillMaxSize()
                .padding(0.dp, 20.dp, 0.dp, 16.dp),
                contentAlignment = Center
            ){
                Text(
                    fontSize = 30.sp,
                    color = MaterialTheme.colors.primaryVariant,
                    text = "The different cuts",
                    style = TextStyle(textDecoration = TextDecoration.Underline)
                )
            }

Row(modifier = Modifier
    .fillMaxWidth(),
Arrangement.SpaceEvenly) {

    Button(onClick = {navController.navigate(Screen.BeefVeal.route)}){
        Column() {
        Text(text = "Beef & Veal",
            color = MaterialTheme.colors.primaryVariant,
            style = TextStyle(textDecoration = TextDecoration.Underline))

        Image(painterResource(id = R.drawable.beef_cut4),
            contentDescription = "Beef cut",
            modifier = Modifier.size(80.dp))
    }
}



        Button(onClick = {navController.navigate(Screen.Pork.route)}){
            Column() {
                Text (
                    text = "Pork",color = MaterialTheme.colors.primaryVariant,
                    style = TextStyle(textDecoration = TextDecoration.Underline),
                    textAlign = TextAlign.Center
                )

                Image(painterResource(id = R.drawable.pork_cut1),
                    contentDescription = "Pork cut",
                    modifier = Modifier.size(80.dp)
                )
            }

        }
    }
            Spacer(modifier = Modifier
                .padding(0.dp, 16.dp)
                .fillMaxWidth())

            Row(modifier = Modifier
                .fillMaxWidth(),
                Arrangement.SpaceEvenly) {

                Button(onClick = {navController.navigate(Screen.Lamb.route)}){
                    Column() {
                        Text (
                            text = "Lamb",color = MaterialTheme.colors.primaryVariant,
                            style = TextStyle(textDecoration = TextDecoration.Underline),
                            textAlign = TextAlign.Center
                        )
                        Image(painterResource(id = R.drawable.lamb_cut1), contentDescription = "Lamb cut", modifier = Modifier.size(80.dp))
                    }

                }


                Button(onClick = {navController.navigate(Screen.Poultry.route)}){
                    Column() {
                        Text (
                            text = "Poultry",color = MaterialTheme.colors.primaryVariant,
                            style = TextStyle(textDecoration = TextDecoration.Underline),
                            textAlign = TextAlign.Center
                        )
                        Spacer(modifier = Modifier.height(5.dp))
                        Image(painterResource(id = R.drawable.chicken_cut1), contentDescription = "Poultry cut", modifier = Modifier.size(80.dp))
                    }
                    }

            }

          Box(modifier = Modifier
              .fillMaxSize()
              .padding(0.dp, 20.dp, 0.dp, 16.dp),
            contentAlignment = Center
                ){
                Text(
                        fontSize = 40.sp,
                        color = MaterialTheme.colors.primaryVariant,
                        text = "Fish",
                        style = TextStyle(textDecoration = TextDecoration.Underline))
                }


                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .absolutePadding(28.dp, 0.dp, 28.dp),
                        ) {
                            Text(
                                fontSize = 20.sp,
                                color = MaterialTheme.colors.primaryVariant,
                                text = stringResource(R.string.fish_intro)
                            )
                        }
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .absolutePadding(28.dp, 28.dp, 28.dp),
                        ) {
                            val titleFish = "Round and flat fish"
                            val infoFish = stringResource(R.string.fish_round_flat)
                            ExpandableCard(
                                title = titleFish,
                                description = infoFish,
                                textColor = MaterialTheme.colors.primaryVariant
                            )
                        }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .absolutePadding(28.dp, 28.dp, 28.dp)
            ) {
                val titleFryingFish = "Tips On Frying Fish"
                val  infoFryingFish= stringResource(R.string.frying_fish)
                ExpandableCard(
                    title = titleFryingFish,   description = infoFryingFish,
                    textColor = MaterialTheme.colors.primaryVariant)
            }


            Box(modifier = Modifier
                .fillMaxSize()
                .padding(0.dp, 20.dp, 0.dp, 16.dp),
                contentAlignment = Center){

                Text(
                    fontSize = 40.sp,
                    color = MaterialTheme.colors.primaryVariant,
                    text = "Temperatures",
                    style = TextStyle(textDecoration = TextDecoration.Underline)

                    )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .absolutePadding(28.dp, 0.dp, 28.dp),
            ) {
                Text(
                    fontSize = 20.sp,
                    color = MaterialTheme.colors.primaryVariant,
                    text = stringResource(R.string.temperatures_intro)
                )
            }

                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .absolutePadding(28.dp, 28.dp, 28.dp),
                        ) {
                            val titleSearing = "Searing Meat"
                            val infoSearing = stringResource(R.string.searing_meat)
                            ExpandableCard(
                                title = titleSearing,
                                description = infoSearing,
                                textColor = MaterialTheme.colors.primaryVariant
                            )
                        }
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .absolutePadding(28.dp, 28.dp, 28.dp),
                        ) {
                            val titleTemp = "Core Temperatures"
                            val infoTemp = stringResource(R.string.core_temperatures)
                            ExpandableCard(
                                title = titleTemp,
                                description = infoTemp,
                                textColor = MaterialTheme.colors.primaryVariant
                            )
                        }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .absolutePadding(28.dp, 28.dp, 28.dp)
            ) {
                Text(
                    fontSize = 20.sp,
                    color = MaterialTheme.colors.primaryVariant,
                    text = stringResource(R.string.next_chapter3))

                Spacer(modifier = Modifier
                    .padding(0.dp, 40.dp)
                    .fillMaxWidth())
            }
                        Row(
                            modifier = Modifier
                                .fillMaxWidth(),
                            Arrangement.Center
                        ) {
                            Button(modifier = Modifier
                                .padding(0.dp, 15.dp, 0.dp, 15.dp),
                                colors = ButtonDefaults.buttonColors(MaterialTheme.colors.secondary),
                                onClick = {
                                    navController.navigate(Screen.Veggies.route)
                                    { popUpTo(Screen.HomeScreen.route) }
                                }) {
                                Text(
                                    fontSize = 20.sp,
                                    color = MaterialTheme.colors.primaryVariant,
                                    text = "Oui Chef!"
                                )

                            }

                        }


                    }
                }
}




