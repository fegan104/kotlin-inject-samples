import SwiftUI
import shared

struct ComposeView: UIViewControllerRepresentable {
    let viewModelFactory = IosAppComponent.companion.from().viewModelFactory
    func makeUIViewController(context: Context) -> UIViewController {
        HomeViewControllerKt.HomeViewController(viewModelFactory: viewModelFactory)
    }

    func updateUIViewController(_ uiViewController: UIViewController, context: Context) {}
}

struct ContentView: View {
    var body: some View {
        ComposeView()
                .ignoresSafeArea(.keyboard) // Compose has own keyboard handler
    }
}
