/**
 * index.tsx
 */



import { Image, StyleSheet, Platform } from 'react-native';

import { HelloWave } from '@/components/HelloWave';
import ParallaxScrollView from '@/components/ParallaxScrollView';
import { ThemedText } from '@/components/ThemedText';
import { ThemedView } from '@/components/ThemedView';
import { IconSymbol } from '@/components/ui/IconSymbol';

export default function HomeScreen() {
    return (
        <>

                    <ParallaxScrollView
                              headerBackgroundColor={{ light: '#D0D0D0', dark: '#353636' }}
                              headerImage={
                                        <IconSymbol
                                                  size={310}
                                                  color="#808080"
                                                  name="chevron.left.forwardslash.chevron.right"
                                                  style={styles.headerImage}
                                        />
                              }>

                              <ThemedView style={styles.titleContainer}>
                                        <ThemedText type="title">HomeScreen</ThemedText>
                              </ThemedView>
                              
                              {/* <ThemedText>This app includes example code to help you get started.</ThemedText> */}
                    </ParallaxScrollView>
        </>
    );
}



const styles = StyleSheet.create({
          headerImage: {
                    color: '#808080',
                    bottom: -90,
                    left: -35,
                    position: 'absolute',
          },
          titleContainer: {
                    flexDirection: 'row',
                    gap: 8,
          },
});
