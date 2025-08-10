import Link from "next/link"
import search from "./InputSearch"
import InputSearch from "./InputSearch"

const Navbar = () => {
    return (
        <header className="bg-blue-500">
            <div className="flex md:flex-row flex-col justify-between p-4 gap-2">
                <Link href="/" className="font-bold text-white text-2xl">AKAZA ANIMELIST</Link>
                <InputSearch/>
            </div>
        </header>
    )
}

export default Navbar