import React from "react";
import { NavigationContainer, StackActions } from "@react-navigation/native";
import Home from "./Home";
import Orders from "./Orders";
import { createStackNavigator } from "@react-navigation/stack";
import OrderDetails from "./Orders/OrderDetails";

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
                <Stack.Screen name="OrderDetails" component={OrderDetails} />
            </Stack.Navigator>
        </NavigationContainer>
    );
}