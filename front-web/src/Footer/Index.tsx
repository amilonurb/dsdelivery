import './Styles.css';
import { ReactComponent as YouTubeIcon } from './youtube.svg';
import { ReactComponent as InstagramIcon } from './instagram.svg';
import { ReactComponent as LinkedinIcon } from './linkedin.svg';

function Footer() {
    return (
        <footer className="main-footer">
            App desenvolvido durante a 2ª ed. do evento Semana DevSuperior
        
            <div className="footer-icons">
                <a href="youtube" target="_new">
                    <YouTubeIcon />
                </a>

                <a href="instagram" target="_new">
                    <InstagramIcon />
                </a>
                
                <a href="linkedin" target="_new">
                    <LinkedinIcon />
                </a>
            </div>
        </footer>
    );
}

export default Footer;