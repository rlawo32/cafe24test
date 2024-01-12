import React from 'react';
import ReactDOM from 'react-dom/client';
import './styles/index.css';
import App from './App';
import axios from "axios";
import reportWebVitals from './reportWebVitals';
import { BrowserRouter } from "react-router-dom";

axios.defaults.baseURL = process.env.REACT_APP_BASE_URL;
axios.defaults.withCredentials = true;
// axios.interceptors.response.use(req => {
//     axios.defaults.headers.common["Authorization"] = axios.defaults.headers.common["Authorization"]?.toString();
//     return req;
// })


const root = ReactDOM.createRoot(
  document.getElementById('root') as HTMLElement
);
root.render(
    <BrowserRouter>
        <App />
    </BrowserRouter>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
