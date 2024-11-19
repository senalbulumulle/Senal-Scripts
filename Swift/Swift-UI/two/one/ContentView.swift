//
//  ContentView.swift
//  one
//
//  Created by Senal on 11/18/24.
//

import SwiftUI

struct ContentView: View {
    var body: some View {
        
        ZStack {
            LinearGradient(gradient: Gradient(colors: [.purple, .green]), startPoint: .topLeading, endPoint: .bottomTrailing).edgesIgnoringSafeArea(.all)
        }
    }
}

#Preview {
    ContentView()
}
