import { StateProvider } from './ApplicationContext';
import AppRoute from './Components/AppRoute';
import routes from './Config/routes.js';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';

// function App() {
//   return (
//       <StateProvider>        
//           <LoginScreen />
//           <MainScreen />
//       </StateProvider>
//   );
// }

function App() {
	return (
		<StateProvider>
			<Router>
				<Switch>
					{routes.map((route) => (
						<AppRoute
							key={route.path}
							path={route.path}
							component={route.component}
							isPrivate={route.isPrivate}
						/>
					))}
				</Switch>
			</Router>
		</StateProvider>
	);
}

export default App;
