package com.practice.adaptnxtassignment

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.rpc.Help
import com.practice.adaptnxtassignment.ui.theme.AdaptNxtAssignmentTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AdaptNxtAssignmentTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // Stack Arrow and Red Circle
                    val scrollState = rememberScrollState()
                    var isChecked by remember { mutableStateOf(false) }


                    Column(modifier = Modifier.fillMaxSize().verticalScroll(scrollState)) {
                        Row {
                            ArrowInTopLeftCornerWithShadow()
                            Spacer(modifier = Modifier.width(213.dp))
                            RedCircleWithInnerCircle()
                        }
                        StepProgressBar(currentStep = 2, totalSteps =3 )
                        Spacer(modifier = Modifier.height(30.dp))
                        Text(
                            text = "Your Basic Details",
                            color = Color.Black,
                            fontSize = 30.sp,
                            modifier=Modifier.
                            padding(start = 15.dp)
                                .align(Alignment.Start)

                        )
                        Spacer(modifier = Modifier.height(5.dp))

                            TextField(
                                value = "", // Replace with your state variable
                                onValueChange = { /* Handle text change */ },
                                modifier = Modifier
                                    .fillMaxWidth()  // Fill the maximum width
                                    .wrapContentHeight()  // Wrap content height

                                    .padding(10.dp),
                                colors = TextFieldDefaults.colors(
                                    focusedTextColor = Color.Black,
                                    unfocusedTextColor = Color.Black,
                                    focusedIndicatorColor = Color.Transparent, // Remove underline when focused
                                    unfocusedIndicatorColor = Color.Transparent // Remove underline when unfocused
                                ),
                                trailingIcon = {
                                    Icon(
                                        imageVector = ImageVector.vectorResource(id = R.drawable.ic_down_arrow), // Replace with your down arrow icon resource
                                        contentDescription = "Down Arrow",
                                        tint = Color.Gray // Change color as needed
                                    )
                                },
                                // Padding inside the text field
                                shape = RoundedCornerShape(20.dp),
                                placeholder = {
                                    Text("Enter your PAN type")  // Placeholder text
                                }
                            )
                            TextField(
                                value = "", // Replace with your state variable
                                onValueChange = { /* Handle text change */ },
                                modifier = Modifier
                                    .fillMaxWidth()  // Fill the maximum width
                                    .wrapContentHeight()  // Wrap content height

                                    .padding(10.dp),
                                colors = TextFieldDefaults.colors(
                                    focusedTextColor = Color.Black,
                                    unfocusedTextColor = Color.Black,
                                    focusedIndicatorColor = Color.Transparent, // Remove underline when focused
                                    unfocusedIndicatorColor = Color.Transparent // Remove underline when unfocused
                                ),
                                // Padding inside the text field
                                shape = RoundedCornerShape(20.dp),
                                placeholder = {
                                    Text("Enter your name(as per PAN)")  // Placeholder text
                                }
                            )

                        TextField(
                            value = "", // Replace with your state variable
                            onValueChange = { /* Handle text change */ },
                            modifier = Modifier
                                .fillMaxWidth()  // Fill the maximum width
                                .wrapContentHeight()  // Wrap content height

                                .padding(10.dp),
                            colors = TextFieldDefaults.colors(
                                focusedTextColor = Color.Black,
                                unfocusedTextColor = Color.Black,
                                focusedIndicatorColor = Color.Transparent, // Remove underline when focused
                                unfocusedIndicatorColor = Color.Transparent // Remove underline when unfocused
                            ),
                            trailingIcon = {
                                Icon(
                                    imageVector = ImageVector.vectorResource(R.drawable.baseline_calendar_today_24),
                                    contentDescription = "Calendar Icon",
                                    tint = Color.Gray // Adjust color as needed
                                )
                            },
                            // Padding inside the text field
                            shape = RoundedCornerShape(20.dp),
                            placeholder = {
                                Text("Enter your date of birth(as per PAN)")  // Placeholder text
                            }
                        )

                        TextField(
                            value = "", // Replace with your state variable
                            onValueChange = { /* Handle text change */ },
                            modifier = Modifier
                                .fillMaxWidth()  // Fill the maximum width
                                .wrapContentHeight()  // Wrap content height

                                .padding(10.dp),
                            colors = TextFieldDefaults.colors(
                                focusedTextColor = Color.Black,
                                unfocusedTextColor = Color.Black,
                                focusedIndicatorColor = Color.Transparent, // Remove underline when focused
                                unfocusedIndicatorColor = Color.Transparent // Remove underline when unfocused
                            ),
                            // Padding inside the text field
                            shape = RoundedCornerShape(20.dp),
                            placeholder = {
                                Text("Enter your address")  // Placeholder text
                            }
                        )

                        TextField(
                            value = "", // Replace with your state variable
                            onValueChange = { /* Handle text change */ },
                            modifier = Modifier
                                .fillMaxWidth()  // Fill the maximum width
                                .wrapContentHeight()  // Wrap content height

                                .padding(10.dp),
                            colors = TextFieldDefaults.colors(
                                focusedTextColor = Color.Black,
                                unfocusedTextColor = Color.Black,
                                focusedIndicatorColor = Color.Transparent, // Remove underline when focused
                                unfocusedIndicatorColor = Color.Transparent // Remove underline when unfocused
                            ),
                            // Padding inside the text field
                            shape = RoundedCornerShape(20.dp),
                            placeholder = {
                                Text("Enter pin code")  // Placeholder text
                            }
                        )

                        TextField(
                            value = "", // Replace with your state variable
                            onValueChange = { /* Handle text change */ },
                            modifier = Modifier
                                .fillMaxWidth()  // Fill the maximum width
                                .wrapContentHeight()  // Wrap content height

                                .padding(10.dp),
                            colors = TextFieldDefaults.colors(
                                focusedTextColor = Color.Black,
                                unfocusedTextColor = Color.Black,
                                focusedIndicatorColor = Color.Transparent, // Remove underline when focused
                                unfocusedIndicatorColor = Color.Transparent // Remove underline when unfocused
                            ),
                            // Padding inside the text field
                            shape = RoundedCornerShape(20.dp),
                            placeholder = {
                                Text("Enter your PAN type")  // Placeholder text
                            }
                        )
                        TextField(
                            value = "", // Replace with your state variable
                            onValueChange = { /* Handle text change */ },
                            modifier = Modifier
                                .fillMaxWidth()  // Fill the maximum width
                                .wrapContentHeight()  // Wrap content height

                                .padding(10.dp),
                            colors = TextFieldDefaults.colors(
                                focusedTextColor = Color.Black,
                                unfocusedTextColor = Color.Black,
                                focusedIndicatorColor = Color.Transparent, // Remove underline when focused
                                unfocusedIndicatorColor = Color.Transparent // Remove underline when unfocused
                            ),
                            // Padding inside the text field
                            shape = RoundedCornerShape(20.dp),
                            placeholder = {
                                Text("Enter city")  // Placeholder text
                            }
                        )

                        TextField(
                            value = "", // Replace with your state variable
                            onValueChange = { /* Handle text change */ },
                            modifier = Modifier
                                .fillMaxWidth()  // Fill the maximum width
                                .wrapContentHeight()  // Wrap content height

                                .padding(10.dp),
                            colors = TextFieldDefaults.colors(
                                focusedTextColor = Color.Black,
                                unfocusedTextColor = Color.Black,
                                focusedIndicatorColor = Color.Transparent, // Remove underline when focused
                                unfocusedIndicatorColor = Color.Transparent // Remove underline when unfocused
                            ),
                            // Padding inside the text field
                            shape = RoundedCornerShape(20.dp),
                            placeholder = {
                                Text("Enter state")  // Placeholder text
                            }
                        )
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(5.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Checkbox(
                                checked = isChecked,
                                onCheckedChange = { checked ->
                                    isChecked = checked
                                },

                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(text = "Same as current address")
                        }
                        Button(
                            onClick = { /* Handle button click */ },
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp)
                                .height(50.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color(0xC8CACDE2)  // Set the button color to grey
                            ), shape = RoundedCornerShape(25.dp)
                        ) {
                            Text(text = "Continue", color = Color.White) // Set the text color to white for contrast
                        }
                    }


                }
            }
        }
    }

    @Composable
    fun RedCircleWithInnerCircle() {
        Box(
            modifier = Modifier
                .wrapContentSize()
                .padding(15.dp),
            contentAlignment = Alignment.TopEnd
        ) {
            // Outer Red Circle
            Box(
                modifier = Modifier
                    .size(40.dp) // Size of the outer circle
                    .background(Color.Red, shape = CircleShape)
            ) {
                // Inner White Circle with Border
                Box(
                    modifier = Modifier
                        .size(21.dp) // Size of the inner circle
                        .background(Color.Red, shape = CircleShape)
                        .border(1.dp, Color.White, shape = CircleShape)
                        .align(Alignment.Center)
                ) {

                    // Question Mark Icon inside the inner circle
                    val questionMarkIcon: Painter = painterResource(id = R.drawable.mark)
                    Image(
                        painter = questionMarkIcon,
                        contentDescription = "Question Mark Icon",
                        modifier = Modifier
                            .size(24.dp)
                            .align(Alignment.Center),
                        colorFilter = ColorFilter.tint(Color.White) // Tint the image if needed
                    )

                }
            }
        }
    }

    @Composable
    fun ArrowInTopLeftCornerWithShadow() {
        Box(
            modifier = Modifier
                .wrapContentSize()
                .padding(16.dp)

        ) {
            // Shadow layer
            Box(
                modifier = Modifier
                    .size(39.dp) // Slightly larger to ensure shadow visibility
                    .clip(RoundedCornerShape(10.dp))
                    .background(Color.Gray.copy(alpha = 0.1f))
                    // Shadow color with some transparency
                    .align(Alignment.TopStart)
                    .offset(x = 2.dp, y = 2.dp)

            )

            // Main box with icon
            Box(
                modifier = Modifier
                    .size(35.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .background(Color.White)
                    .align(Alignment.TopStart)
                    .border(
                        width = 1.dp,
                        color = Color.Gray.copy(alpha = 0.2f),
                        shape = RoundedCornerShape(10.dp)
                    ),

                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "Back Arrow",
                    tint = Color.Black
                )
            }
        }
    }
    @Composable
    fun StepProgressBar(
        currentStep: Int,
        totalSteps: Int
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(horizontal = 11.dp) // Overall padding for centering
                .padding(start = 0.dp, end = 0.dp), // Adjusted start and end padding for balance
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center // Center the content horizontally
        ) {
            repeat(totalSteps) { index ->
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Box(
                        modifier = Modifier
                            .size(40.dp)
                            .background(
                                color = if (index < currentStep) Color(0xFF006400) else Color.Gray,
                                shape = CircleShape
                            )
                            .then(
                                if (index == currentStep - 1) { // Apply glow effect to the current step
                                    Modifier
                                        .border(
                                            width = 2.dp,
                                            color = Color(0xFF78A542), // Light green border color
                                            shape = CircleShape
                                        )
                                        .shadow(
                                            elevation = 8.dp,
                                            shape = CircleShape,
                                            ambientColor = Color(0xFF78A542).copy(alpha = 0.2f), // Light green ambient color
                                            spotColor = Color(0xFF78A542).copy(alpha = 0.2f) // Light green shadow color
                                        )
                                } else Modifier
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        if (index == 0 && currentStep > 0) {
                            // Display tick mark for the first step if it's completed
                            Icon(
                                imageVector = Icons.Filled.Check,
                                contentDescription = "Tick Mark",
                                tint = Color.White,
                                modifier = Modifier.size(24.dp)
                            )
                        } else {
                            // Display step number for the remaining steps
                            Text(
                                text = "${index + 1}",
                                color = Color.White,
                                fontSize = 14.sp
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(4.dp))
                    // Display label below the circle
                    Text(
                        text = when (index) {
                            0 -> "Pan Details"
                            1 -> "Basic Details"
                            2 -> "Bank Details"
                            else -> ""
                        },
                        color = Color.Black,
                        fontSize = 12.sp
                    )
                }
                if (index < totalSteps - 1) {
                    Box(
                        modifier = Modifier
                            .width(80.dp) // Width of the line should be equal to the circle diameter
                            .height(4.dp)
                            .offset(y= (-3).dp)// Height of the line
                            .background(
                                color = if (index < currentStep - 1) Color(0xFF006400) else Color.Gray
                            )
                            .align(Alignment.CenterVertically)
                    )
                }
            }
        }
    }





    @Preview(showBackground = true)
    @Composable
    fun PreviewArrowInTopLeftCornerWithShadow() {
        ArrowInTopLeftCornerWithShadow()
    }

    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        AdaptNxtAssignmentTheme {
            ArrowInTopLeftCornerWithShadow()
            StepProgressBar(currentStep = 2, totalSteps = 3)
            RedCircleWithInnerCircle()
        }
    }
}
