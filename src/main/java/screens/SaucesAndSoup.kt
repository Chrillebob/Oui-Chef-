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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import dev.chris.ouichefcompose.R
import dev.chris.ouichefcompose.ui.theme.ExpandableCard
import dev.chris.ouichefcompose.ui.theme.OuiChefComposeTheme
import navigation.Screen


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun SaucesAndSoup(navController: NavController) {
    OuiChefComposeTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background( MaterialTheme.colors.primary)
                .verticalScroll(rememberScrollState(), enabled = true)

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
                    painter = painterResource(R.drawable.soup_sauce1),
                    contentDescription = "Title",
                    contentScale = ContentScale.Crop,

                    )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .absolutePadding(28.dp, 28.dp, 28.dp ),
            ) {
                Text(   fontSize = 20.sp,
                    color =  MaterialTheme.colors.primaryVariant,
                    text = stringResource(R.string.sauce_intro))
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .absolutePadding(28.dp, 28.dp, 28.dp ),
            ) {
                val titleMotherSauce = "Mother Sauces"
                val infoMotherSauce= stringResource(R.string.mother_sauces)
                ExpandableCard(title = titleMotherSauce, description = infoMotherSauce, textColor =  MaterialTheme.colors.primaryVariant)
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .absolutePadding(28.dp, 28.dp, 28.dp ),
            ) {
                val titleRoux= "Roux"
                val infoRoux = stringResource(R.string.roux)
                ExpandableCard(title = titleRoux, description =infoRoux, textColor =  MaterialTheme.colors.primaryVariant)
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .absolutePadding(28.dp, 28.dp, 28.dp ),
            ) {
                val titleLegere = "Liaison"
                val infoLegere = stringResource(R.string.legere)
                ExpandableCard(title = titleLegere, description =infoLegere, textColor =  MaterialTheme.colors.primaryVariant)
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .absolutePadding(28.dp, 28.dp, 28.dp ),
            ) {
                val titleEssence= "Making Essence"
                val infoEssence = stringResource(R.string.making_essence)
                ExpandableCard(title = titleEssence, description =infoEssence, textColor =  MaterialTheme.colors.primaryVariant)
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .absolutePadding(28.dp, 28.dp, 28.dp ),
            ) {
                val titleHollandaise= "Making Hollandaise"
                val infoHollandaise = stringResource(R.string.making_hollandaise)
                ExpandableCard(title = titleHollandaise, description =infoHollandaise, textColor =  MaterialTheme.colors.primaryVariant)
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .absolutePadding(28.dp, 28.dp, 28.dp ),
            ) {
                val titleSoup = "Soups"
                val infoSoup = stringResource(R.string.soups)
                ExpandableCard(title = titleSoup, description =infoSoup, textColor =  MaterialTheme.colors.primaryVariant)
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .absolutePadding(28.dp, 28.dp, 28.dp ),
            ) {
                val titleStock = "Making Bouillon"
                val infoStock= stringResource(R.string.making_stock)
                ExpandableCard(title = titleStock, description =infoStock, textColor =  MaterialTheme.colors.primaryVariant)
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .absolutePadding(28.dp, 28.dp, 28.dp)
            ) {
                Text(
                    fontSize = 20.sp,
                    color = MaterialTheme.colors.primaryVariant,
                    text = stringResource(R.string.next_chapter5))

                Spacer(modifier = Modifier
                    .padding(0.dp, 40.dp)
                    .fillMaxWidth())
            }
            Row(modifier = Modifier
                .fillMaxWidth(),
                Arrangement.Center) {
                Button(  modifier = Modifier
                    .padding(0.dp,15.dp,0.dp,15.dp),
                    colors = ButtonDefaults.buttonColors( MaterialTheme.colors.secondary),
                    onClick = {navController.navigate(Screen.Sensory.route)
                    {popUpTo(Screen.HomeScreen.route)}
                    }) {
                    Text(fontSize = 20.sp,
                        color =  MaterialTheme.colors.primaryVariant,
                        text = "Oui Chef!")

                }

            }
        }
    }

}

