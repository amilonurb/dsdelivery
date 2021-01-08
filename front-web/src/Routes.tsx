import { BrowserRouter, Route, Switch } from "react-router-dom";
import Home from "./Home/Index";
import Navbar from "./Navbar/Index";
import Orders from "./Orders/Index";

function Routes() {
    return (
        <BrowserRouter>
            <Navbar />

            <Switch>
                <Route exact path="/" component={Home} />

                <Route path="/orders" component={Orders} />
            </Switch>
        </BrowserRouter>
    );
}

export default Routes;