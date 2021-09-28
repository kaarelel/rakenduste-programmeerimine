import './Navbar.css';
import { Link } from 'react-router-dom';

function Navbar() {
    return (
        <div className="navbar">
            <Link to="/add-cat">
                <img className="category" src="kategooria.svg" alt="Kategooria" /></Link>
            <Link to="/">
                <img className="logo" src="Hellye.png" alt=""/> 
            </Link>
            <Link to="cart">
                <img className="cart" src="cart.svg" alt=""/> 
            </Link>
        </div>
    );
}

export default Navbar;