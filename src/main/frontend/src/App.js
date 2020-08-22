import React from 'react';
import logo from './logo.svg';
import './App.css';
import AppointmentsProvider from "./appointments/AppointmentsProvider";

function App() {
  return (
    <div>
      <AppointmentsProvider/>
    </div>
  );
}

export default App;
