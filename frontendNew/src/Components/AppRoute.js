import React from 'react';
import { Redirect, Route } from 'react-router-dom';

import { ApplicationContext } from '../ApplicationContext';

const AppRoutes = ({ component: Component, path, isPrivate, ...rest }) => {
	const { state } = React.useContext(ApplicationContext);
	return (
		<Route
			path={path}
			render={(props) =>
				isPrivate && !state.user ? (
					<Redirect to={{ pathname: '/login' }} />
				) : (
					<Component {...props} />
				)
			}
			{...rest}
		/>
	);
};

export default AppRoutes;
