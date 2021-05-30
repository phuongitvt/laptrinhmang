import React from 'react';
import Login from '../Pages/Login';
import Home from '../Pages/Home';
import NotFound from '../Pages/NotFound';

const routes = [
	{
		path: '/login',
		component: Login,
		isPrivate: false,
	},
	{
		path: '/signup',
		component: Login,
		isPrivate: false,
	},
	{
		path: '/detail',
		component: Login,
		isPrivate: true,
	},
	{
		path: '/',
		component: Home,
		isPrivate: true,
	},
	{
		path: '/*',
		component: NotFound,
		isPrivate: true,
	},
];

export default routes;
