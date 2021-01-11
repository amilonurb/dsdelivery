import React from "react";
import { NavigationContainer, StackActions } from "@react-navigation/native";
import Home from "./Home";
import Orders from "./Orders";
import { createStackNavigator } from "@react-navigation/stack";

const Stack = createStackNavigator();

export default function Routes() {
    return (
        <NavigationContainer>
            <Stack.Navigator
                headerMode="none"
                screenOptions={{
                    cardStyle: {
                        backgroundColor: '#FFF'
                    }
                }}
            >
                <Stack.Screen name="Home" component={Home} />
                <Stack.Screen name="Orders" component={Orders} />
            </Stack.Navigator>
        </NavigationContainer>
    );
}