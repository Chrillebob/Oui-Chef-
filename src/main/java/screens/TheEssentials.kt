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
fun TheEssentials(navController: NavController) {
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
                        .align(Alignment.Center)
                        .padding(16.dp, 8.dp, 16.dp, 8.dp),
                    painter = painterResource(R.drawable.the_essentials1),
                    contentDescription = "Title",
                    contentScale = ContentScale.Crop,

                    )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .absolutePadding(28.dp, 28.dp, 28.dp )
            ) {
                Text(   fontSize = 20.sp,
                    color = MaterialTheme.colors.primaryVariant,
                    text = stringResource(R.string.the_essential))
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .absolutePadding(28.dp, 28.dp, 28.dp )
            ) {
                val titleWorkStation = "Work Station"
                val infoWorkStation = stringResource(R.string.station_setup)
                ExpandableCard(
                    title = titleWorkStation,   description = infoWorkStation,
                    textColor = MaterialTheme.colors.primaryVariant)
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .absolutePadding(28.dp, 28.dp, 28.dp )
            ) {
                val titleKnives = "Handling Knives"
                val infoKnives = stringResource(R.string.knives)
                ExpandableCard(title = titleKnives,   description = infoKnives, textColor = MaterialTheme.colors.primaryVariant)
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .absolutePadding(28.dp, 28.dp, 28.dp )
            ) {
                val titleCommunication = "Communication"
                val infoCommunication = stringResource(R.string.communication)
                ExpandableCard(
                    title = titleCommunication,   description = infoCommunication,
                    textColor = MaterialTheme.colors.primaryVariant)
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .absolutePadding(28.dp, 28.dp, 28.dp )
            ) {
                val titleWorkRotation = "Work Rotation"
                val infoWorkRotation = stringResource(R.string.work_rotation)
                ExpandableCard(
                    title = titleWorkRotation,    description = infoWorkRotation,
                    textColor = MaterialTheme.colors.primaryVariant)
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .absolutePadding(28.dp, 28.dp, 28.dp )
            ) {
                val titleRightTool = "The Right Tool For The Job"
                val infoRightTool = stringResource(R.string.right_tool)
                ExpandableCard(title = titleRightTool,   description = infoRightTool, textColor = MaterialTheme.colors.primaryVariant)
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .absolutePadding(28.dp, 28.dp, 28.dp )
            ) {
                val titlePanSizes = "Tips On Pots And Pans"
                val infoPanSizes = stringResource(R.string.pan_size)
                ExpandableCard(title = titlePanSizes,   description = infoPanSizes, textColor = MaterialTheme.colors.primaryVariant)
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .absolutePadding(28.dp, 28.dp, 28.dp )
            ) {
                val titleMaillard = "The Maillard Reaction"
                val infoMaillard = stringResource(R.string.maillard)
                ExpandableCard(title = titleMaillard,   description = infoMaillard, textColor = MaterialTheme.colors.primaryVariant)
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .absolutePadding(28.dp, 28.dp, 28.dp )
            ) {
                val titleMeasurements = "Writing Recipes"
                val  infoMeasurements= stringResource(R.string.measurements)
                ExpandableCard(
                    title = titleMeasurements,   description = infoMeasurements,
                    textColor = MaterialTheme.colors.primaryVariant)
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .absolutePadding(28.dp, 28.dp, 28.dp )
            ) {
                val titleCookingMethods = "Cooking Methods"
                val infoCookingMethods = stringResource(R.string.cooking_methods)
                ExpandableCard(
                    title = titleCookingMethods,   description =infoCookingMethods,
                    textColor = MaterialTheme.colors.primaryVariant)
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .absolutePadding(28.dp, 28.dp, 28.dp)
            ) {
                Text(
                    fontSize = 20.sp,
                    color = MaterialTheme.colors.primaryVariant,
                    text = stringResource(R.string.next_chapter2))

                Spacer(modifier = Modifier
                    .padding(0.dp, 40.dp)
                    .fillMaxWidth())
            }
            Row(modifier = Modifier
                .fillMaxWidth(),
                Arrangement.Center) {
                Button(  modifier = Modifier
                    .padding(0.dp,15.dp,0.dp,15.dp),
                    colors = ButtonDefaults.buttonColors(MaterialTheme.colors.secondary),
                    onClick = {navController.navigate(Screen.Meat.route)
                    {popUpTo(Screen.HomeScreen.route)}
                    }) {
                    Text(fontSize = 20.sp,
                        color = MaterialTheme.colors.primaryVariant,
                        text = "Oui Chef!")

                }

            }
        }
    }

    }
