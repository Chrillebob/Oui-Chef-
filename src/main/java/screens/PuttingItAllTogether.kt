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
fun PuttingItAllTogether(navController: NavController) {
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
                    painter = painterResource(R.drawable.putting_it_all_together1),
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
                    text = stringResource(R.string.chapter7_intro))
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .absolutePadding(28.dp, 28.dp, 28.dp ),
            ) {
                val titleSpices = "Spices"
                val infoSpices= stringResource(R.string.spices)
                ExpandableCard(title = titleSpices, description = infoSpices, textColor =  MaterialTheme.colors.primaryVariant)
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .absolutePadding(28.dp, 28.dp, 28.dp ),
            ) {
                val titleMarinades = "Marinades"
                val infoMarinades= stringResource(R.string.marinades)
                ExpandableCard(title = titleMarinades, description =infoMarinades, textColor =  MaterialTheme.colors.primaryVariant)
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .absolutePadding(28.dp, 28.dp, 28.dp ),
            ) {
                val titleTenderize = "Tenderizing Meat"
                val infoTenderize= stringResource(R.string.tenderizing)
                ExpandableCard(title = titleTenderize, description = infoTenderize, textColor =  MaterialTheme.colors.primaryVariant)
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .absolutePadding(28.dp, 28.dp, 28.dp ),
            ) {
                val titleStarch = "Working With Starch"
                val infoStarch= stringResource(R.string.starch_intro)
                ExpandableCard(title = titleStarch, description =infoStarch, textColor =  MaterialTheme.colors.primaryVariant)
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .absolutePadding(28.dp, 28.dp, 28.dp ),
            ) {
                val titleFat = "Fat Infusion"
                val infoFat= stringResource(R.string.fat_intro)
                ExpandableCard(title = titleFat, description = infoFat, textColor =  MaterialTheme.colors.primaryVariant)
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .absolutePadding(28.dp, 28.dp, 28.dp ),
            ) {
                val titleOilAndMayo = "Oil & Mayonnaise"
                val  infoOilAndMayo = stringResource(R.string.oil_and_mayo)
                ExpandableCard(title = titleOilAndMayo, description = infoOilAndMayo, textColor =  MaterialTheme.colors.primaryVariant)
            }
            Box(modifier = Modifier.fillMaxSize()
                .padding(0.dp, 20.dp, 0.dp, 16.dp),
                contentAlignment = Alignment.Center
            ){
                Text(
                    fontSize = 40.sp,
                    color = MaterialTheme.colors.primaryVariant,
                    text = "General Tips",
                    style = TextStyle(textDecoration = TextDecoration.Underline)
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .absolutePadding(28.dp, 28.dp, 28.dp ),
            ) {
                val titleGreatBase = "A Great Foundation"
                val infoGreatBase= stringResource(R.string.holy_foundation)
                ExpandableCard(title = titleGreatBase, description = infoGreatBase, textColor =  MaterialTheme.colors.primaryVariant)
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .absolutePadding(28.dp, 28.dp, 28.dp ),
            ) {
                val titleEggs = "Cooking Eggs"
                val infoEggs= stringResource(R.string.cooking_eggs)
                ExpandableCard(title = titleEggs, description = infoEggs, textColor =  MaterialTheme.colors.primaryVariant)
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .absolutePadding(28.dp, 28.dp, 28.dp ),
            ) {
                val titleAlcohol = "Alcohol In Cooking"
                val infoAlcohol = stringResource(R.string.alcohol_in_cooking)
                ExpandableCard(title = titleAlcohol, description =infoAlcohol, textColor =  MaterialTheme.colors.primaryVariant)
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .absolutePadding(28.dp, 28.dp, 28.dp ),
            ) {
                val titleBatter = "Simpel Batter"
                val infoBatter = stringResource(R.string.simple_batter)
                ExpandableCard(title = titleBatter, description =infoBatter, textColor =  MaterialTheme.colors.primaryVariant)
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .absolutePadding(28.dp, 28.dp, 28.dp ),
            ) {
                val titleSousVide = "Sous Vide"
                val infoSousVide= stringResource(R.string.sous_vide)
                ExpandableCard(title = titleSousVide, description = infoSousVide, textColor =  MaterialTheme.colors.primaryVariant)
            }
            Box(modifier = Modifier.fillMaxSize()
                .padding(0.dp, 20.dp, 0.dp, 16.dp),
                contentAlignment = Alignment.Center
            ){
                Text(
                    fontSize = 40.sp,
                    color = MaterialTheme.colors.primaryVariant,
                    text = "Improvisation",
                    style = TextStyle(textDecoration = TextDecoration.Underline))
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .absolutePadding(28.dp, 28.dp, 28.dp ),
            ) {
                Text(   fontSize = 20.sp,
                    color =  MaterialTheme.colors.primaryVariant,
                    text = stringResource(R.string.improv_intro))
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .absolutePadding(28.dp, 28.dp, 28.dp ),
            ) {
                val titleImprovSauce = "Improvised Sauces"
                val infoImprovSauce= stringResource(R.string.improv_sauce)
                ExpandableCard(title = titleImprovSauce, description = infoImprovSauce, textColor =  MaterialTheme.colors.primaryVariant)
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .absolutePadding(28.dp, 28.dp, 28.dp ),
            ) {
                val titleGlazing = "Glazing"
                val infoGlazing= stringResource(R.string.glazing)
                ExpandableCard(title = titleGlazing, description =infoGlazing, textColor =  MaterialTheme.colors.primaryVariant)
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .absolutePadding(28.dp, 28.dp, 28.dp ),
            ) {
                val titleRice= "Spice Up Your Rice"
                val infoRice = stringResource(R.string.spice_up_your_rice)
                ExpandableCard(title = titleRice, description =infoRice, textColor =  MaterialTheme.colors.primaryVariant)
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .absolutePadding(28.dp, 28.dp, 28.dp ),
            ) {
                val titleRoast = "Utilizing Leftover Meat"
                val infoRoast = stringResource(R.string.whole_roasts)
                ExpandableCard(title = titleRoast, description =infoRoast, textColor =  MaterialTheme.colors.primaryVariant)
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .absolutePadding(28.dp, 28.dp, 28.dp ),
            ) {
                Text(   fontSize = 20.sp,
                    color =  MaterialTheme.colors.primaryVariant,
                    text = stringResource(R.string.final_thought))
            }
            Row(modifier = Modifier
                .fillMaxWidth(),
                Arrangement.Center) {
                Button(  modifier = Modifier
                    .padding(0.dp,15.dp,0.dp,15.dp),
                    colors = ButtonDefaults.buttonColors( MaterialTheme.colors.secondary),
                    onClick = {navController.navigate(Screen.HomeScreen.route)
                    {popUpTo(Screen.HomeScreen.route)}
                    }) {
                    Text(fontSize = 20.sp,
                        color =  MaterialTheme.colors.primaryVariant,
                        text = "Back to main menu")

                }

            }
        }
    }

}



