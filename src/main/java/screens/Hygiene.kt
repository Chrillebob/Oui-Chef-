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
 fun Hygiene(navController: NavController) {
    OuiChefComposeTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colors.primary)
                .verticalScroll(rememberScrollState(), true),
        ){
        Box(
            modifier = Modifier

                .fillMaxWidth(),
        ) {
            Image(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.Center)
                    .padding(16.dp, 8.dp, 16.dp, 8.dp),
                painter = painterResource(R.drawable.hygiene1),
                contentDescription = "Title",
                contentScale = ContentScale.Crop,

                )
                Spacer(modifier = Modifier
                    .padding(0.dp, 35.dp)
                    .fillMaxWidth())
            }

            Row(modifier = Modifier
                .fillMaxWidth()
                .absolutePadding(28.dp, 10.dp, 28.dp)

            ){
                Text(
                    fontSize = 20.sp,
                    color = MaterialTheme.colors.primaryVariant,
                    text = stringResource(R.string.hygiene))

            }
            Spacer(
                modifier = Modifier
                    .padding(0.dp, 5.dp)
                    .fillMaxWidth()
            )

            Row(
                modifier = Modifier
                    .absolutePadding(28.dp, 28.dp, 28.dp )
            ) {
                val titleBacteria = "Microorganisms"
                val infoBacteria = stringResource(R.string.bacteria)
                ExpandableCard(title = titleBacteria, description = infoBacteria, textColor = MaterialTheme.colors.primaryVariant)

            }
            Row(modifier = Modifier
                .absolutePadding(28.dp, 28.dp, 28.dp )
            ) {
                val titleGrowth = "Conditions For Growth And How To Prevent It "
                val infoGrowth = stringResource(R.string.growth_conditions)
                ExpandableCard(title = titleGrowth, description = infoGrowth, textColor = MaterialTheme.colors.primaryVariant)
            }
            Row(modifier = Modifier
                .absolutePadding(28.dp, 28.dp, 28.dp )
            ) {
                val titleContamination = "Contamination"
                val infoContamination = stringResource(R.string.guidelines_cleaning)
                ExpandableCard(title = titleContamination, description = infoContamination, textColor = MaterialTheme.colors.primaryVariant)

            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .absolutePadding(28.dp, 28.dp, 28.dp)
            ) {
                Text(
                    fontSize = 20.sp,
                    color = MaterialTheme.colors.primaryVariant,
                    text = stringResource(R.string.next_chapter1))

                Spacer(modifier = Modifier
                    .padding(0.dp, 40.dp)
                    .fillMaxWidth())
            }
            Row(modifier = Modifier
                .fillMaxWidth(),
                Arrangement.Center) {
                Button(
                    modifier = Modifier
                        .padding(0.dp,15.dp,0.dp,15.dp),
                    colors = ButtonDefaults.buttonColors(MaterialTheme.colors.secondary),
                    onClick = {navController.navigate(Screen.TheEssentials.route)
                    {popUpTo(Screen.HomeScreen.route)}
                    }) {
                    Text(
                        fontSize = 20.sp,
                        color = MaterialTheme.colors.primaryVariant,
                        text = "Oui Chef!")

                }

            }

        }
    }

}





/*
@Preview
@Composable
fun Testing(){
    Hygiene()
}


*/









