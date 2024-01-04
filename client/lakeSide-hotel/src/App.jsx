import './App.css'
import '../node_modules/bootstrap/dist/css/bootstrap.min.css';
import '/node_modules/bootstrap/dist/js/bootstrap.min.js';
import AddRoom from './components/room/AddRoom'
import EditRoom from './components/room/EditRoom'
import ExistingRooms from './components/room/ExistingRooms';
import {BrowserRouter as Router, Route,  Routes } from 'react-router-dom';
import Home from "./components/home/Home"
import Footer from './components/layout/footer';

function App() {

  return (
    <>
    <main>
      <Router>
      <Routes>
      <Route path="/" element={<Home />} />
						<Route path="/edit-room/:roomId" element={<EditRoom />} />
						<Route path="/existing-rooms" element={<ExistingRooms />} />
						<Route path="/add-room" element={<AddRoom />} />
    </Routes>
      </Router>
      
      <Footer />
    </main>

    </>
  )
}

export default App