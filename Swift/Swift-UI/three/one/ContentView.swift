//
//  ContentView.swift
//  one
//
//  Created by Senal on 11/18/24.
//

import SwiftUI
import WidgetKit

struct ContentView: View {
    var body: some View {

        NavigationStack {
            ZStack {
                LinearGradient(
                    gradient: Gradient(colors: [.purple, .green]), startPoint: .topLeading,
                    endPoint: .bottomTrailing
                )

                // Full thing
                .ignoresSafeArea()
            }

            .navigationTitle("Something Something")
        }
    }
}

#Preview {
    ContentView()
}
