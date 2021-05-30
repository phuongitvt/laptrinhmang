import { ApplicationContext } from '../ApplicationContext';
import { useContext, useState } from 'react';
import { Button, Container, Form, Row, Col } from 'react-bootstrap';
import axios from 'axios';
import config from '../config.json';
import { useHistory } from "react-router-dom";


function Login(props) {
    const { dispatch } = useContext(ApplicationContext);
    const [username, setUsername] = useState('');
    const [password, setPassword] = useState('');
    const history = useHistory();

    async function login() {
        try {
            const result = await axios.post(config.backend + '/login', {
                body: {
                    username,
                    password,
                }
            });

            if (result.status === 200) {
                localStorage.setItem('currentUser', JSON.stringify(result.config.data));
                dispatch({ type: 'LOGIN_SUCCESS', payload: JSON.stringify(result.config.data) });
                history.push('/');
            } else {
                dispatch({ type: 'LOGIN_FAIL' })
            }
        } catch (e) {
            console.log(e);
        }
    }

    return (
        <div>
            <form className="form-signin">
                <img className="mb-4" src="/docs/4.6/assets/brand/bootstrap-solid.svg" alt="" width={72} height={72} />
                <h1 className="h3 mb-3 font-weight-normal">Please sign in</h1>
                <label htmlFor="inputEmail" className="sr-only">Email address</label>
                <input type="email" id="inputEmail" className="form-control" placeholder="Enter username"
                    onChange={e => setUsername(e.target.value)} required autofocus />
                <label htmlFor="inputPassword" className="sr-only">Password</label>
                <input type="password" id="inputPassword" className="form-control" placeholder="Password"
                    onChange={e => setPassword(e.target.value)} required />
                <div className="checkbox mb-3">
                    <label> <input type="checkbox" defaultValue="remember-me" /> Remember me</label>
                </div>
                <button className="btn btn-lg btn-primary btn-block" type="button" onClick={() => login()}>Sign in</button>
                <p className="mt-5 mb-3 text-muted">© 2017-2021</p>
            </form>
        </div>
    );
}

export default Login;