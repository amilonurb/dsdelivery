import "intl";
import { useFonts, OpenSans_400Regular, OpenSans_700Bold } from '@expo-google-fonts/open-sans';
import AppLoading from 'expo-app-loading';
import { StatusBar } from 'expo-status-bar';
import React from 'react';
import { Platform, StyleSheet, View } from 'react-native';
import Routes from './src/routes';

if (Platform.OS === "android") {
    if (typeof (Intl as any).__disableRegExpRestore === "function") {
        (Intl as any).__disableRegExpRestore();
    }
}

import "intl/locale-data/jsonp/pt-BR";

export default function App() {

    let [fontsLoaded] = useFonts({
        OpenSans_400Regular,
        OpenSans_700Bold
    });

    if (!fontsLoaded) {
        return <AppLoading />
    }

    return (
        <View style={styles.container}>
            <StatusBar style="auto" />
            <Routes />
        </View>
    );
}

const styles = StyleSheet.create({
    container: {
        flex: 1
    },
});