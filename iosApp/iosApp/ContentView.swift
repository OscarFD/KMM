import SwiftUI
import shared

func greet() -> String {
    return Greeting().greeting()
}

func addTwoNumbers() -> String {
    return
        Calculator().addition(number1:3, number2:9)
}

func logEventAnalytic(eventName: String, eventParam:[String : String]) ->  Void{
    AnalyticManager().logEvent(eventName: eventName, eventParam: eventParam )
}

func initializeAnalytics(iosAppId: String, iosToken: String){
    AnalyticManager().initialize(appID: iosAppId, appToken: iosToken)
}

struct ContentView: View {
    var body: some View {
        Text(addTwoNumbers())
        
    }
    
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
    
}
