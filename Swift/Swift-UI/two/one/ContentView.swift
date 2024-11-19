//
//  ContentView.swift
//  one
//
//  Created by Senal on 11/18/24.
//

import SwiftUI

struct ContentView: View {
    var body: some View {
        
        NavigationStack 
        {
            ZStack 
            {
                LinearGradient(gradient: Gradient(colors: [.purple, .green]), startPoint: .topLeading, endPoint: .bottomTrailing)

                    .ignoresSafeArea() 

                VStack 
                {
                    Text("Hello, World!")
                        .font(.largeTitle)
                        .foregroundColor(.black)
                        .padding()

                    // Button("Tap Me") {
                    //     // Perform action here
                    // }
                }
            }
            
            .navigationTitle("Something Something") 
        }
    }
}

#Preview {
    ContentView()
}
