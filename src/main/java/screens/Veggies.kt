package screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
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
fun Veggies(navController: NavController) {
    OuiChefComposeTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colors.primary)
                .verticalScroll(rememberScrollState(), enabled = true)

        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .absolutePadding(28.dp, 28.dp, 28.dp),
                Arrangement.Center
            ) {

                Box(
                    modifier = Modifier

                        .fillMaxWidth(),
                ) {
                    Image(
                        modifier = Modifier
                            .fillMaxWidth()
                            .align(Alignment.Center)
                            .padding(16.dp, 8.dp, 16.dp, 8.dp),
                        painter = painterResource(R.drawable.veggies1),
                        contentDescription = "Title",
                        contentScale = ContentScale.Crop,

                        )
                }

                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .absolutePadding(28.dp, 28.dp, 28.dp),
                ) {
                    Text(
                        fontSize = 20.sp,
                        color = MaterialTheme.colors.primaryVariant,
                        text = stringResource(R.string.veggies_intro)
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .absolutePadding(28.dp, 28.dp, 28.dp),
                ) {
                    val titleCookingVeggies = "Cooking Vegetables"
                    val infoCookingVeggies = stringResource(R.string.cooking_veggies)
                    ExpandableCard(
                        title = titleCookingVeggies, description = infoCookingVeggies,
                        textColor = MaterialTheme.colors.primaryVariant
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .absolutePadding(28.dp, 28.dp, 28.dp),
                ) {
                    val titleCaramel = "Caramelization"
                    val infoCaramel = stringResource(R.string.maillard_veggies)
                    ExpandableCard(
                        title = titleCaramel,
                        description = infoCaramel,
                        textColor = MaterialTheme.colors.primaryVariant
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .absolutePadding(28.dp, 28.dp, 28.dp),
                ) {
                    val titlePure = "Purée & Mash Potatoes"
                    val infoPure = stringResource(R.string.making_pure)
                    ExpandableCard(
                        title = titlePure,
                        description = infoPure,
                        textColor = MaterialTheme.colors.primaryVariant
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .absolutePadding(28.dp, 28.dp, 28.dp),
                ) {
                    val titleOsmosis = "Osmosis"
                    val infoOsmosis = stringResource(R.string.osmosis)
                    ExpandableCard(
                        title = titleOsmosis,
                        description = infoOsmosis,
                        textColor = MaterialTheme.colors.primaryVariant
                    )
                }
            Box(modifier = Modifier.fillMaxSize()
                .padding(0.dp, 20.dp, 0.dp, 16.dp),
                contentAlignment = Alignment.Center
            ){
                Text(
                    fontSize = 40.sp,
                    color = MaterialTheme.colors.primaryVariant,
                    text = "Herbs",
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
                        text = stringResource(R.string.herb_intro)
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .absolutePadding(28.dp, 28.dp, 28.dp),
                ) {
                    val titlePaste = "Paste & Pesto"
                    val infoPaste = stringResource(R.string.paste_pesto)
                    ExpandableCard(
                        title = titlePaste,
                        description = infoPaste,
                        textColor = MaterialTheme.colors.primaryVariant
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .absolutePadding(28.dp, 28.dp, 28.dp),
                ) {
                    val titleOil = "Flavored Oil"
                    val infoOil = stringResource(R.string.flavored_oil)
                    ExpandableCard(
                        title = titleOil,
                        description = infoOil,
                        textColor = MaterialTheme.colors.primaryVariant
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .absolutePadding(28.dp, 28.dp, 28.dp),
                ) {
                    val titleDust = "Dust & Ash"
                    val infoDust = stringResource(R.string.making_dust)
                    ExpandableCard(
                        title = titleDust,
                        description = infoDust,
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
                    text = stringResource(R.string.next_chapter4))

                Spacer(modifier = Modifier
                    .padding(0.dp, 40.dp)
                    .fillMaxWidth())
            }
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    Arrangement.Center
                ) {
                    Button(
                        modifier = Modifier
                            .padding(0.dp, 15.dp, 0.dp, 15.dp),
                        colors = ButtonDefaults.buttonColors(MaterialTheme.colors.secondary),
                        onClick = {
                            navController.navigate(Screen.SoupSauce.route)
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

